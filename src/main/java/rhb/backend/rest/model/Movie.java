package rhb.backend.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

// Add the AuditingEntityListener for JPA auditing
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "movies")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdDate", "modifiedDate"}, 
        allowGetters = true)
public class Movie implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	//Auto increment movieId
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long movieId;
	
	@Column(nullable = false)
	private String title;

	@OneToOne
	@JoinColumn(name="CATEGORY_ID")
	private Category category;
	
	@OneToOne
	@JoinColumn(name="RATING_ID")
	private Rating rating;
	
	@Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdDate;
	
	@Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date modifiedDate;
	
	
	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}
	
	public long getMovieId() {
		return this.movieId;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Category getCategory() {
		return this.category;
	}
	
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	
	public Rating getRating() {
		return this.rating;
	}
	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public Date getCreatedDate() {
		return this.createdDate;
	}
	
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	public Date getModifiedDate() {
		return this.modifiedDate;
	}
	

}

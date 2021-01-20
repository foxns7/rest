package rhb.backend.rest.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "rating")
@EntityListeners(AuditingEntityListener.class)
public class Rating implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ratingId;
	
	@Column(nullable = false)
	private String rating;

	
	public void setRatingId(long ratingId) {
		this.ratingId = ratingId;
	}
	
	public long getRatingId() {
		return this.ratingId;
	}
	
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public String getRating() {
		return this.rating;
	}
	

}

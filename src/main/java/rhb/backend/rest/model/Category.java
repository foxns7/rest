package rhb.backend.rest.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "category")
@EntityListeners(AuditingEntityListener.class)
public class Category implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long categoryId;
	
	@Column(nullable = false)
	private String category;

	
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	public long getCategoryId() {
		return this.categoryId;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getCategory() {
		return this.category;
	}
	

}

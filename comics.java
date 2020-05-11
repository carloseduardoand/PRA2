import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "comics")
public class Comics {
	
	@PrimaryKey(autoGenerate = true)
	@NonNull
	@ColumnInfo(name = "id")
	private int id;
	
	@Nullable
	@ColumnInfo(name = "creationDate")
	private String creationDate;
	
	@Nullable
	@ColumnInfo(name = "description")
	private String description;

	@Nullable
	@ColumnInfo(name = "author")
	private String author;
	
	@ColumnInfo(name = "score")
	private int score;
	
	public Stress(@Nullable String creationDate, @Nullable String description, @Nullable String author, int score) {
		this.creationDate = creationDate;
		this.description = description;
		this.author = author;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(@NonNull int id) {
		this.id = id;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(@Nullable String creationDate) {
		this.creationDate = creationDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(@Nullable String description) {
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(@Nullable String author) {
		this.author = author;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}

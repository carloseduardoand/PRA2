import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity(tableName = "comics")
public class Comics {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "comicsId")
    private int mId;
    @Nullable
    @ColumnInfo(name = "comicsTitle")
    private String mTitle;
    public int getId() {
        return mId;
    }
    public void setId(@NonNull int id) {
        mId = id;
    }
    public String getTitle() {
        return mTitle;
    }
    public void setTitle(@Nullable String title) {
        mTitle = title;
    }
    public String getAuthor() {
        return mAuthor;
    }
    public void setAuthor(String author) {
        mAuthor = author;
    }
    public String getCreationDate() {
        return mCreationDate;
    }
    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }
    public String getDesciption() {
        return mDescription;
    }
    public void setTitle(@Nullable String description) {
        mDescription = description;
    }
    private String mAuthor;
    private String mDescription;
    private String mCreationDate;
    public int getScore() {
        return mScore;
    }
    public void setScore(int score) {
        mScore = score;
    }
    private int mScore;
    public Comics(@Nullable String title, String author, int score, String creationDate, String description) {
        mTitle = title;
        mAuthor = author;
        mScore = score;
        mCreationDate = creationDate;
  	mDescription = description;
    }
}

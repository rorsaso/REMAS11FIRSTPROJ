package HUS.REMAS.remas11firstproj.data.subjectTable;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MySubjectQuery {
    /**
     *
     */
    @Query("SELECT * FROM MySubject")
    List<MySubject> getAllSubjects();

    /**
     *
     */
    @Insert
    void insert(MySubject... s);

    /**
     *
     */
    @Update
    void update(MySubject... s);
    /**
     *
     */
    @Delete
    void deleteTask(MySubject...s);
    @Query("DELETE FROM MySubject WHERE key_id=:keyid")
    void delete(long keyid);
    @Query("SELECT * FROM MySubject WHERE title=:sub")
    MySubject checkSubject(String sub);
}
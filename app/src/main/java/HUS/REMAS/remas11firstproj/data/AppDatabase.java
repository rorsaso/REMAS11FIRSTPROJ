package HUS.REMAS.remas11firstproj.data;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import HUS.REMAS.remas11firstproj.data.myTasksTable.MyTask;
import HUS.REMAS.remas11firstproj.data.myTasksTable.MyTaskQuery;
import HUS.REMAS.remas11firstproj.data.subjectTable.MySubject;
import HUS.REMAS.remas11firstproj.data.subjectTable.MySubjectQuery;
import HUS.REMAS.remas11firstproj.data.userTable.MyUserQuery;

public abstract class AppDatabase extends RoomDatabase {
/**
 *
 */
private static AppDatabase db;
/**
 *
 */
public abstract MyUserQuery getMyQuery();
/**
 *
 */
public abstract MySubjectQuery getMySubjectQuery();
/**
 *
 */
public abstract MyTaskQuery getMyTaskQuery();
/**
 *
 */
public static AppDatabase getDb(Context context){
    if (db==null)
    {
        db= Room.databaseBuilder(Context AppDataBase.class"samihDataBase")

    }


}


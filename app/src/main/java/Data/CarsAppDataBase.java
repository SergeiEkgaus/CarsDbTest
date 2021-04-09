package Data;


import Model.Car;
import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Car.class}, version = 1)
public abstract class CarsAppDataBase extends RoomDatabase {

    public abstract CarDAO getCarDAO();

}

package smalltalk.database;
import android.provider.BaseColumns;


public final class DBContract {
	public DBContract() {}
	
	public static abstract class DBEntry implements BaseColumns {
		public static final String TABLE_NAME = "DBDB";
		public static final String COLUMN_NAME_ENTRY_ID = "ID";
	}
}

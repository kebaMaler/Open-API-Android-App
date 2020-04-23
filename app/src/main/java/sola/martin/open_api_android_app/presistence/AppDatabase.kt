package sola.martin.open_api_android_app.presistence

import androidx.room.Database
import androidx.room.RoomDatabase
import sola.martin.open_api_android_app.models.AccountProperties
import sola.martin.open_api_android_app.models.AuthToken

@Database(entities = [AuthToken::class, AccountProperties::class ], version = 1)
abstract class AppDatabase: RoomDatabase() {

    abstract fun getAuthTokenDao(): AuthTokenDao

    abstract fun hetAccountPropertiesDao(): AccountPropertiesDao

    companion object{

        const val DATABASE_NAME = "app_db"
    }


}
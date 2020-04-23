package sola.martin.open_api_android_app.presistence

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import sola.martin.open_api_android_app.models.AccountProperties

@Dao
interface AccountPropertiesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAndReplace(accountProperties: AccountProperties):Long

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertOrIgnore(accountProperties: AccountProperties):Long

    @Query(value = "SELECT * FROM account_properties WHERE pk = :pk")
    fun searchByPrimaryKey(pk: Int): AccountProperties?

    @Query(value = "SELECT * FROM account_properties WHERE pk = :email")
    fun searchByEmail(email: String): AccountProperties?
}
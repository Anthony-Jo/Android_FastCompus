package com.example.my_app

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.realm.Realm
import io.realm.RealmConfiguration
import kotlinx.android.synthetic.main.activity_realm.*

class RealmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_realm)

        Realm.init(this@RealmActivity)
        val config : RealmConfiguration = RealmConfiguration.Builder()
            .deleteRealmIfMigrationNeeded()     /*  마이그레이션이 필요하면 Realm을 삭제함 */
            .build()
        Realm.setDefaultConfiguration(config)   /*  */
        val realm = Realm.getDefaultInstance()

        button_save.setOnClickListener {
            realm.executeTransaction {
                /* A table에서 data load
                *  B table에서 data load
                *  C table에서 data load
                *  조합을 한다
                *  D table에 save        */
                with(it.createObject(School::class.java)) {
                    this.name = "A"
                    this.location = "Seoul"
                }
            }
        }
        button_load.setOnClickListener {
            realm.executeTransaction {
                val data = it.where(School::class.java).findFirst()
                Log.d("data", "data: $data")
            }
        }
        button_delete.setOnClickListener {
            realm.executeTransaction {
                it.where(School::class.java).findAll().deleteAllFromRealm()
/*              it.where(School::class.java).findFirst().deleteFromRealm()  첫 줄만 지우기    */
            }
        }
    }
}
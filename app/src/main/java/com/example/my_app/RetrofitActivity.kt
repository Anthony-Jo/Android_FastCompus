package com.example.my_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit)

        //  http::/mellowcode.org/json/studnets/
        //  http::/mellowcode.org/test/code/

        val retrofit = Retrofit.Builder()
            .baseUrl("http://mellowcode.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service = retrofit.create(RetrofitService::class.java)

        service.getStudentsList().enqueue(object : Callback<ArrayList<PersonFromServer>> {
            override fun onFailure(call: Call<ArrayList<PersonFromServer>>, t: Throwable) {
                call.isCanceled
                call.isExecuted
                call.cancel()
            }

            override fun onResponse(
                call: Call<ArrayList<PersonFromServer>>,
                response: Response<ArrayList<PersonFromServer>>
            ) {
                if (response.isSuccessful) {
                    val personList = response.body()
                    Log.d("retrofit1", "Response: ${personList?.get(0)?.age}")

                    val code = response.code()
                    Log.d("retrofit1", "Code: $code")

                    val header = response.headers()
                    Log.d("retrofit1", "Header: $header")
                }
            }
        })
/*
        val params = HashMap<String, Any>()
        params.put("name", "Anthony_Jo")
        params.put("age", 20)
        params.put("intro", "hello")
        service.createStudents(params).enqueue(object : Callback<PersonFromServer>{
            override fun onFailure(call: Call<PersonFromServer>, t: Throwable) {
            }

            override fun onResponse(
                call: Call<PersonFromServer>,
                response: Response<PersonFromServer>
            ) {
                if (response.isSuccessful) {
                    val person = response.body()
                    Log.d("retrofit1", "Name: ${person?.name}")
                }
            }
        })
*/
        val person = PersonFromServer(name = "Mr.Kim", age = 30, intro = "Hello i am kim")
        service.createStudentsEasy(person).enqueue(object : Callback<PersonFromServer> {
            override fun onFailure(call: Call<PersonFromServer>, t: Throwable) {
            }

            override fun onResponse(
                call: Call<PersonFromServer>,
                response: Response<PersonFromServer>
            ) {
                if (response.isSuccessful) {
                    val person = response.body()
                    Log.d("retrofit1", "Name: ${person?.name}")
                }
            }
        })
    }
}
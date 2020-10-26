package com.example.my_app

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("life_cycle", "F onCreateView")
        /*  프라그먼트가 인터페이스를 처름으로 그릴 때 호출된다.   */
        /*  inflater -> View를 그려준다  */
        /*  container -> 부모 View    */
        return inflater.inflate(R.layout.fragment_two, container, false)

    }
}
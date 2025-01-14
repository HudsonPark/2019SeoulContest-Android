package com.seoulcontest.firstcitizen.viewmodel

import androidx.databinding.ObservableField
import com.seoulcontest.firstcitizen.data.vo.Request
import com.seoulcontest.firstcitizen.data.vo.User
import com.seoulcontest.firstcitizen.network.RetrofitHelper
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailViewModel {
    val request = ObservableField<Request>()

    fun loadData(id: Int) {
        RetrofitHelper
            .getInstance()
            .apiService
            .getDetailRequestById(id)
            .enqueue(object : Callback<Request> {
                override fun onFailure(call: Call<Request>, t: Throwable) {
                    t.printStackTrace()
                }

                override fun onResponse(call: Call<Request>, response: Response<Request>) {
                    val data = response.body()
                    data?.let { request.set(data) }
                }
            })
    }
}
package com.sid1818713.plannerapp.ui.clocks

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ClocksViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is clocks Fragment"
    }
    val text: LiveData<String> = _text
}
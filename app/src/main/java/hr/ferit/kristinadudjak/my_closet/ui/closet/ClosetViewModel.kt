package hr.ferit.kristinadudjak.my_closet.ui.closet

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ClosetViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is closet Fragment"
    }
    val text: LiveData<String> = _text
}
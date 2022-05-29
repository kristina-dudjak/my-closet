package hr.ferit.kristinadudjak.my_closet.ui.combinations

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CombinationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is combinations Fragment"
    }
    val text: LiveData<String> = _text
}
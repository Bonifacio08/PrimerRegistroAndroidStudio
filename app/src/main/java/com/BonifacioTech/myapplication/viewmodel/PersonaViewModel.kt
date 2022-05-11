package com.BonifacioTech.myapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.BonifacioTech.myapplication.data.PersonaDao
import com.BonifacioTech.myapplication.model.Persona
import kotlinx.coroutines.launch
import java.util.concurrent.Flow
import javax.inject.Inject

class PersonaViewModel @Inject constructor(
    val personaDao: PersonaDao
) : ViewModel(){
    val persona : Flow<List<Persona>>
    get() = personaDao.GetLista()

    private val _guardado = MutableLiveData(false)
    val guardado: LiveData<Boolean> get() = _guardado

    fun guardar(persona: Persona){
        viewModelScope.launch {
            personaDao.Insertar(persona)
            _guardado.value=true
        }
    }

}


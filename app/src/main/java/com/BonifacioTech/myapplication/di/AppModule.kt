package com.BonifacioTech.myapplication.di

import android.content.Context
import androidx.room.Room
import com.BonifacioTech.myapplication.data.PersonaDao
import com.BonifacioTech.myapplication.data.RegistroDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun ProvideTicketDb(@ApplicationContext context: Context): RegistroDb{
        val DATABASE_NAME = "RegistroDb"
            return Room.databaseBuilder(
                context,
                RegistroDb::class.java,
                DATABASE_NAME).fallbackToDestructiveMigration().build()

    }

    @Provides
    fun ProvidePersonaDAO(registroDb: RegistroDb): PersonaDao {
        return registroDb.personaDao
    }
}
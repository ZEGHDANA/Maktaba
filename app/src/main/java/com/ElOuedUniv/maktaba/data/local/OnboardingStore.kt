package com.ElOuedUniv.maktaba.data.local

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

// 1. تعريف الـ DataStore يكون خارج الكلاس لضمان وجود نسخة واحدة فقط (Singleton)
private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "onboarding_prefs")

class OnboardingStore(private val context: Context) {

    companion object {
        // 2. مفتاح التخزين
        val ONBOARDING_COMPLETED_KEY = booleanPreferencesKey("has_completed_onboarding")
    }

    // 3. دالة لحفظ الحالة (تُستدعى عند الضغط على زر Start)
    suspend fun saveOnboardingState(isCompleted: Boolean) {
        context.dataStore.edit { preferences ->
            preferences[ONBOARDING_COMPLETED_KEY] = isCompleted
        }
    }

    // 4. دالة لقراءة الحالة (Stream)
    val isOnboardingCompleted: Flow<Boolean> = context.dataStore.data
        .map { preferences ->
            preferences[ONBOARDING_COMPLETED_KEY] ?: false
        }
}
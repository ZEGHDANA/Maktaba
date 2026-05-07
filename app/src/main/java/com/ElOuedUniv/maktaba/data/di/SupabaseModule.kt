package com.ElOuedUniv.maktaba.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.storage.Storage
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SupabaseModule {
    @Provides
    @Singleton
    fun provideSupabaseClient(): SupabaseClient {
        return createSupabaseClient(
<<<<<<< HEAD
            supabaseUrl = "https://arwttuysbzhyhwxawcbj.supabase.co",
            supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImFyd3R0dXlzYnpoeWh3eGF3Y2JqIiwicm9sZSI6ImFub24iLCJpYXQiOjE3NzgwNzY1NTQsImV4cCI6MjA5MzY1MjU1NH0.VtU00Bakslo5GdSzx54IBe2E_cg26WOOie7NKs9X9zg"
=======
            supabaseUrl = "https://pquhmspwcsdgqxgercvh.supabase.co",
            supabaseKey = " eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InBxdWhtc3B3Y3NkZ3F4Z2VyY3ZoIiwicm9sZSI6ImFub24iLCJpYXQiOjE3NzgwODQyMDUsImV4cCI6MjA5MzY2MDIwNX0.KumjOlaRi5bO-B61lLsvGN3dc_uvHCxYucXMVWDZRyI"
>>>>>>> b60fb44 (add TP5 instructions for Supabase)
        ) {
            install(Postgrest)
            install(Storage)
        }
    }
}
package com.amroid.fetcher.data.di

import com.amroid.fetcher.data.cache.SqliteHelper
import com.amroid.fetcher.data.remote.ApiClient
import com.amroid.fetcher.data.repos.RequestRepository
import com.amroid.fetcher.domain.usecases.GetCachedRequestsUseCase
import com.amroid.fetcher.domain.usecases.SendRequestUseCase

interface IAppModule {
  val apiClient: ApiClient
  val sqliteHelper: SqliteHelper
  val requestRepository: RequestRepository
  val sendRequestUseCase:SendRequestUseCase
  val getCachedRequestsUseCase:GetCachedRequestsUseCase
}
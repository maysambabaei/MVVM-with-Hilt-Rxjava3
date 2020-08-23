package com.example.pokemon.repository;

import com.example.pokemon.db.PokeDao;
import com.example.pokemon.network.PokeApiService;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Repository_Factory implements Factory<Repository> {
  private final Provider<PokeDao> pokeDaoProvider;

  private final Provider<PokeApiService> apiServiceProvider;

  public Repository_Factory(Provider<PokeDao> pokeDaoProvider,
      Provider<PokeApiService> apiServiceProvider) {
    this.pokeDaoProvider = pokeDaoProvider;
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public Repository get() {
    return newInstance(pokeDaoProvider.get(), apiServiceProvider.get());
  }

  public static Repository_Factory create(Provider<PokeDao> pokeDaoProvider,
      Provider<PokeApiService> apiServiceProvider) {
    return new Repository_Factory(pokeDaoProvider, apiServiceProvider);
  }

  public static Repository newInstance(PokeDao pokeDao, PokeApiService apiService) {
    return new Repository(pokeDao, apiService);
  }
}

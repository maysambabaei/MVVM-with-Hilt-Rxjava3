package com.example.pokemon.viewmodel;

import com.example.pokemon.repository.Repository;
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
public final class PokemonViewModel_AssistedFactory_Factory implements Factory<PokemonViewModel_AssistedFactory> {
  private final Provider<Repository> repositoryProvider;

  public PokemonViewModel_AssistedFactory_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public PokemonViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static PokemonViewModel_AssistedFactory_Factory create(
      Provider<Repository> repositoryProvider) {
    return new PokemonViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static PokemonViewModel_AssistedFactory newInstance(Provider<Repository> repository) {
    return new PokemonViewModel_AssistedFactory(repository);
  }
}

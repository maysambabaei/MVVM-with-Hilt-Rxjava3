package com.example.pokemon.viewmodel;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.example.pokemon.repository.Repository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class PokemonViewModel_AssistedFactory implements ViewModelAssistedFactory<PokemonViewModel> {
  private final Provider<Repository> repository;

  @Inject
  PokemonViewModel_AssistedFactory(Provider<Repository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public PokemonViewModel create(@NonNull SavedStateHandle arg0) {
    return new PokemonViewModel(repository.get());
  }
}

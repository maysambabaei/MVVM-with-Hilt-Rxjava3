package com.example.pokemon.di;

import com.example.pokemon.db.PokeDao;
import com.example.pokemon.db.PokemonDB;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DataBaseModule_ProvidePokeDaoFactory implements Factory<PokeDao> {
  private final Provider<PokemonDB> pokemonDBProvider;

  public DataBaseModule_ProvidePokeDaoFactory(Provider<PokemonDB> pokemonDBProvider) {
    this.pokemonDBProvider = pokemonDBProvider;
  }

  @Override
  public PokeDao get() {
    return providePokeDao(pokemonDBProvider.get());
  }

  public static DataBaseModule_ProvidePokeDaoFactory create(Provider<PokemonDB> pokemonDBProvider) {
    return new DataBaseModule_ProvidePokeDaoFactory(pokemonDBProvider);
  }

  public static PokeDao providePokeDao(PokemonDB pokemonDB) {
    return Preconditions.checkNotNull(DataBaseModule.providePokeDao(pokemonDB), "Cannot return null from a non-@Nullable @Provides method");
  }
}

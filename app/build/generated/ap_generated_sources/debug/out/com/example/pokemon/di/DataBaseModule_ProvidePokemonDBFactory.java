package com.example.pokemon.di;

import android.app.Application;
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
public final class DataBaseModule_ProvidePokemonDBFactory implements Factory<PokemonDB> {
  private final Provider<Application> applicationProvider;

  public DataBaseModule_ProvidePokemonDBFactory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public PokemonDB get() {
    return providePokemonDB(applicationProvider.get());
  }

  public static DataBaseModule_ProvidePokemonDBFactory create(
      Provider<Application> applicationProvider) {
    return new DataBaseModule_ProvidePokemonDBFactory(applicationProvider);
  }

  public static PokemonDB providePokemonDB(Application application) {
    return Preconditions.checkNotNull(DataBaseModule.providePokemonDB(application), "Cannot return null from a non-@Nullable @Provides method");
  }
}

package com.example.pokemon.di;

import com.example.pokemon.network.PokeApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvidePokemonApiServiceFactory implements Factory<PokeApiService> {
  @Override
  public PokeApiService get() {
    return providePokemonApiService();
  }

  public static NetworkModule_ProvidePokemonApiServiceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PokeApiService providePokemonApiService() {
    return Preconditions.checkNotNull(NetworkModule.providePokemonApiService(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvidePokemonApiServiceFactory INSTANCE = new NetworkModule_ProvidePokemonApiServiceFactory();
  }
}

package com.example.pokemon.viewmodel;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = PokemonViewModel.class
)
public interface PokemonViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.example.pokemon.viewmodel.PokemonViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(PokemonViewModel_AssistedFactory factory);
}

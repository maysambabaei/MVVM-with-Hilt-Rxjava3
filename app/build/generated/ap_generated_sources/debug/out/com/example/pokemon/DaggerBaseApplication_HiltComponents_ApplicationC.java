package com.example.pokemon;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.example.pokemon.db.PokeDao;
import com.example.pokemon.db.PokemonDB;
import com.example.pokemon.di.DataBaseModule;
import com.example.pokemon.di.DataBaseModule_ProvidePokeDaoFactory;
import com.example.pokemon.di.DataBaseModule_ProvidePokemonDBFactory;
import com.example.pokemon.di.NetworkModule;
import com.example.pokemon.di.NetworkModule_ProvidePokemonApiServiceFactory;
import com.example.pokemon.network.PokeApiService;
import com.example.pokemon.repository.Repository;
import com.example.pokemon.ui.MainActivity;
import com.example.pokemon.ui.fragments.Favorites;
import com.example.pokemon.ui.fragments.Home;
import com.example.pokemon.viewmodel.PokemonViewModel_AssistedFactory;
import com.example.pokemon.viewmodel.PokemonViewModel_AssistedFactory_Factory;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerBaseApplication_HiltComponents_ApplicationC extends BaseApplication_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object pokemonDB = new MemoizedSentinel();

  private volatile Object pokeDao = new MemoizedSentinel();

  private volatile Object pokeApiService = new MemoizedSentinel();

  private DaggerBaseApplication_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private PokemonDB getPokemonDB() {
    Object local = pokemonDB;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = pokemonDB;
        if (local instanceof MemoizedSentinel) {
          local = DataBaseModule_ProvidePokemonDBFactory.providePokemonDB(ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule));
          pokemonDB = DoubleCheck.reentrantCheck(pokemonDB, local);
        }
      }
    }
    return (PokemonDB) local;
  }

  private PokeDao getPokeDao() {
    Object local = pokeDao;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = pokeDao;
        if (local instanceof MemoizedSentinel) {
          local = DataBaseModule_ProvidePokeDaoFactory.providePokeDao(getPokemonDB());
          pokeDao = DoubleCheck.reentrantCheck(pokeDao, local);
        }
      }
    }
    return (PokeDao) local;
  }

  private PokeApiService getPokeApiService() {
    Object local = pokeApiService;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = pokeApiService;
        if (local instanceof MemoizedSentinel) {
          local = NetworkModule_ProvidePokemonApiServiceFactory.providePokemonApiService();
          pokeApiService = DoubleCheck.reentrantCheck(pokeApiService, local);
        }
      }
    }
    return (PokeApiService) local;
  }

  @Override
  public void injectBaseApplication(BaseApplication baseApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder dataBaseModule(DataBaseModule dataBaseModule) {
      Preconditions.checkNotNull(dataBaseModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder networkModule(NetworkModule networkModule) {
      Preconditions.checkNotNull(networkModule);
      return this;
    }

    public BaseApplication_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerBaseApplication_HiltComponents_ApplicationC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements BaseApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public BaseApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends BaseApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements BaseApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public BaseApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends BaseApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<Repository> repositoryProvider;

      private volatile Provider<PokemonViewModel_AssistedFactory> pokemonViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private Repository getRepository() {
        return new Repository(DaggerBaseApplication_HiltComponents_ApplicationC.this.getPokeDao(), DaggerBaseApplication_HiltComponents_ApplicationC.this.getPokeApiService());
      }

      private Provider<Repository> getRepositoryProvider() {
        Object local = repositoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          repositoryProvider = (Provider<Repository>) local;
        }
        return (Provider<Repository>) local;
      }

      private PokemonViewModel_AssistedFactory getPokemonViewModel_AssistedFactory() {
        return PokemonViewModel_AssistedFactory_Factory.newInstance(getRepositoryProvider());
      }

      private Provider<PokemonViewModel_AssistedFactory> getPokemonViewModel_AssistedFactoryProvider(
          ) {
        Object local = pokemonViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          pokemonViewModel_AssistedFactoryProvider = (Provider<PokemonViewModel_AssistedFactory>) local;
        }
        return (Provider<PokemonViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>singletonMap("com.example.pokemon.viewmodel.PokemonViewModel", (Provider) getPokemonViewModel_AssistedFactoryProvider());
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerBaseApplication_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements BaseApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public BaseApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends BaseApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerBaseApplication_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectFavorites(Favorites favorites) {
        }

        @Override
        public void injectHome(Home home) {
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements BaseApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public BaseApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends BaseApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements BaseApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public BaseApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends BaseApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.example.pokemon.viewmodel.PokemonViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getPokemonViewModel_AssistedFactory();

            case 1: // com.example.pokemon.repository.Repository 
            return (T) ActivityCImpl.this.getRepository();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements BaseApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public BaseApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends BaseApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}

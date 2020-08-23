// Generated by view binder compiler. Do not edit!
package com.example.pokemon.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.pokemon.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class HomeBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RecyclerView pokemonRecyclerView;

  private HomeBinding(@NonNull RelativeLayout rootView, @NonNull RecyclerView pokemonRecyclerView) {
    this.rootView = rootView;
    this.pokemonRecyclerView = pokemonRecyclerView;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static HomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static HomeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static HomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    String missingId;
    missingId: {
      RecyclerView pokemonRecyclerView = rootView.findViewById(R.id.pokemonRecyclerView);
      if (pokemonRecyclerView == null) {
        missingId = "pokemonRecyclerView";
        break missingId;
      }
      return new HomeBinding((RelativeLayout) rootView, pokemonRecyclerView);
    }
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
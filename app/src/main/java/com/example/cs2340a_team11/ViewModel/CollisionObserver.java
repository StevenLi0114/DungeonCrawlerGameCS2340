package com.example.cs2340a_team11.ViewModel;
import android.view.View;

import com.example.cs2340a_team11.Model.Player;


public interface CollisionObserver {
    void collision(Player player, MovementStrategy movementStrategy);
}

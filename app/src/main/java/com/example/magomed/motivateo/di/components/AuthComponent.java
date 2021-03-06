package com.example.magomed.motivateo.di.components;

import com.example.magomed.motivateo.di.module.ApiModule;
import com.example.magomed.motivateo.di.module.AuthModule;
import com.example.magomed.motivateo.di.module.ManagerModule;
import com.example.magomed.motivateo.presenter.AuthorizationFragmentPresenterImpl;
import com.example.magomed.motivateo.presenter.MainActivityPresenterImpl;
import com.example.magomed.motivateo.presenter.WelcomeFragmentPresenterImpl;
import com.example.magomed.motivateo.view.activity.InteractionActivity;
import com.example.magomed.motivateo.view.fragment.WelcomeFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules =
        {
                ApiModule.class,
                AuthModule.class,
                ManagerModule.class,
        }
)
public interface AuthComponent {
    void inject(InteractionActivity interactionActivity);
    void inject(WelcomeFragment welcomeFragment);
    void inject(WelcomeFragmentPresenterImpl welcomeFragmentPresenter);
    void inject(MainActivityPresenterImpl mainActivityPresenter);
    void inject(AuthorizationFragmentPresenterImpl authorizationFragmentPresenter);
}

package com.example.magomed.motivateo.view.fragment;

public interface ISignInFragment {
    void popFragmentFromStack();
    boolean isEmpty();
    void startActivity(Class<?> cls);
    void errorSignIn();
}

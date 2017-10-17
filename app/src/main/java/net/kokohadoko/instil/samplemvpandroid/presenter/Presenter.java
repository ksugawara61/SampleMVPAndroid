package net.kokohadoko.instil.samplemvpandroid.presenter;

public interface Presenter<V> {

    void attachView(V view);

    void detachView();

}

package net.kokohadoko.instil.samplemvpandroid.view;

import net.kokohadoko.instil.samplemvpandroid.model.Repository;

import java.util.List;


public interface MainMvpView extends MvpView {

    void showRepositories(List<Repository> repositories);

    void showMessage(int stringId);

    void showProgressIndicator();
}

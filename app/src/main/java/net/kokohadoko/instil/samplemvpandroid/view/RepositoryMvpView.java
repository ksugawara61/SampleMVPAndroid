package net.kokohadoko.instil.samplemvpandroid.view;

import net.kokohadoko.instil.samplemvpandroid.model.User;

public interface RepositoryMvpView extends MvpView {

    void showOwner(final User owner);
}

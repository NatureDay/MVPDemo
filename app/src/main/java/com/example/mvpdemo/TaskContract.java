package com.example.mvpdemo;

public interface TaskContract {

    interface View {
        void showToast();

        void setPresenter(Presenter presenter);
    }

    interface Presenter {
        void click();
    }

}

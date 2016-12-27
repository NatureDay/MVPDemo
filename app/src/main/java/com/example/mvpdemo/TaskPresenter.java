package com.example.mvpdemo;

public class TaskPresenter implements TaskContract.Presenter {

    private TaskContract.View mView;

    public TaskPresenter(TaskContract.View view) {
        this.mView = view;
        mView.setPresenter(this);
    }

    @Override
    public void click() {
        mView.showToast();
    }
}

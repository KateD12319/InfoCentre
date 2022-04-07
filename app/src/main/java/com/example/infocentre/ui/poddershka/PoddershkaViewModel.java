package com.example.infocentre.ui.poddershka;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PoddershkaViewModel extends ViewModel {


    private MutableLiveData<String> mText;
    private MutableLiveData<String> Text2;
    private MutableLiveData<String> Text3;
    private MutableLiveData<String> Text4;
    private MutableLiveData<String> Text5;
    private MutableLiveData<String> Text6;

    public PoddershkaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Удалённая техническая поддержка");
        Text2 = new MutableLiveData<>();
        Text2.setValue("Для оказания удалённой технической поддержки и сопровождения наших программных продуктов мы используем ПО TeamViewer.\n" +
                "Вы можете скачать необходимую версию на данной странице.");
        Text3 = new MutableLiveData<>();
        Text3.setValue("Скачать TeamViewer 9 QuickSupport: https://infocentre.su/files/TeamViewer9_QS.exe");
        Text4 = new MutableLiveData<>();
        Text4.setValue("Не требует установки или прав администратора — просто скачайте, запустите и сообщите ID и пароль специалисту нашей компании.");
        Text5 = new MutableLiveData<>();
        Text5.setValue("Скачать TeamViewer 9 Host: https://infocentre.su/files/TeamViewer9_Host_Setup.exe");
        Text6 = new MutableLiveData<>();
        Text6.setValue("Используется только для приема входящих подключений. Устанавливается в систему, чтобы иметь возможность подключения наших специалистов в любой момент.\n" +
                "Можно настроить доступ к компьютеру как по случайному паролю, так и по постоянному.");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public LiveData<String> getText2() {
        return Text2;
    }

    public LiveData<String> getText3() {
        return Text3;
    }

    public LiveData<String> getText4() {
        return Text4;
    }

    public LiveData<String> getText5() {
        return Text5;
    }

    public LiveData<String> getText6() {
        return Text6;
    }
}
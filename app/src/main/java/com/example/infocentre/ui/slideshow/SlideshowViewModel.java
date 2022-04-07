package com.example.infocentre.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<String> mText2;
    private MutableLiveData<String> mText3;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Дополнение к типовой конфигурации «1С: Торговля и Склад 7.7» стоимость состовляет 0 рублей");

        mText2 = new MutableLiveData<>();
        mText2.setValue("Дополнение к типовой конфигурации «1С: Торговля и Склад 8.1» стоимость состовляет 0 рублей");

        mText3 = new MutableLiveData<>();
        mText3.setValue("Продукт разработан компанией «Системные технологии» www.sys4tec " +
                "и успешно внедряется на рынке с 2000 года. На сегодня автоматизированы более 600 компаний в России и СНГ.\n" +
                "Более подробно узнать о пользователях системы и " +
                "ознакомиться с их отзывами о системе можно здесь: http://www.sys4tec.com/clients/");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public LiveData<String> getText2() {
        return mText2;
    }

    public LiveData<String> getText3() {
        return mText3;
    }
}
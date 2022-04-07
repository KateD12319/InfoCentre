package com.example.infocentre.ui.gotov_rab;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class GotovViewModel extends ViewModel {


    private MutableLiveData<String> mText;
    private MutableLiveData<String> Text2;
    private MutableLiveData<String> Text3;

    public GotovViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Программный комплекс «ST-Мобильная торговля»\n" +
                "для автоматизации торговых представителей и мерчандайзеров\n");
        Text2 = new MutableLiveData<>();
        Text2.setValue("«ST-Мобильная торговля» для 1С обеспечит вашу компанию современным инструментом управления," +
                " значительно снизит ваши издержки, снимет внутренние ограничения роста и даст уверенность в контроле над ситуацией.");
        Text3 = new MutableLiveData<>();
        Text3.setValue("Возможности решения:\n" +
                "\n" +
                "•\tАвтоматизация сбора предварительного заказа (он-лайн резервирование товара с подтверждением актуальных остатков);\n" +
                "•\tАвтоматизация продаж «с колес» (мобильная печать документов);\n" +
                "•\tМерчандайзинг;\n" +
                "•\tКонтроль  деятельности торгового агента, в т.ч. GPS;\n" +
                "•\tДанные о торговых точках, задолженностях и оплатах;\n" +
                "•\tПостановка индивидуальных и групповых планов агентам;\n" +
                "•\tИстория продаж, авторасчет заказа и многие другие,\n" +
                " которые подробно описаны в данной ссылке:\n" +
                "http://www.sys4tec.com/produce/catalog/mobile/");
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
}
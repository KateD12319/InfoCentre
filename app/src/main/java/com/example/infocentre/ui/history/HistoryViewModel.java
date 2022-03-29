package com.example.infocentre.ui.history;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HistoryViewModel extends ViewModel {


    private MutableLiveData<String> mText;

    public HistoryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Честно говоря, не очень хочется рассказывать о том, какие мы \"крутые компьютерщики\"," +
                "  какая у нас шикарная производственная база и так далее, и тому подобное...\n" +
                "Год образования нашей компании - 1993.\n" +
                "То, что мы вот уже больше двадцати лет успешно работаем на компьютерном рынке, в общем-то, неплохая характеристика.\n" +
                "\n" +
                "Мы предоставляем полный цикл работ по компьютеризации предприятия, офиса, дома, жизни:\n" +
                "\n" +
                "- проектирование, поставка необходимого оборудования и монтаж локальных вычислительных сетей\n" +
                "- поставка гарантийной компьютерной, копировальной и офисной техники\n" +
                "- разработка и внедрение программного обеспечения\n" +
                "- обучение персонала работе с различными программными средствами автоматизации в нашем учебном центре \"ОРИОН\"\n" +
                "- гарантийное обслуживание, ремонт вычислительной и орг- техники в течение всего срока эксплуатации\n" +
                "- сопровождение собственных программных разработок и программных продуктов других фирм\n" +
                "- моральная поддержка нуждающимся... - Всего не расскажешь словами, лучше в этом убедиться на собственном опыте, став нашим Клиентом."
        );
    }

    public LiveData<String> getText() {
        return mText;
    }
}
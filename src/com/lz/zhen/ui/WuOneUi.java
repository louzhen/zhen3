package com.lz.zhen.ui;

import com.lz.zhen.logic.NameValueUtil;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class WuOneUi extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		 requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wuone);
		setGoodContent();
	}
	
	private void setGoodContent()
	{
		int index = 0;
		index = NameValueUtil.getGoodIndex(getIntent().getStringExtra("name"));
		TextView textView01 = (TextView)findViewById(R.id.textview_wuone_1);
		TextView textView02 = (TextView)findViewById(R.id.textview_wuone_2);
		TextView textView03 = (TextView)findViewById(R.id.textview_wuone_3);
		TextView textView04 = (TextView)findViewById(R.id.textview_wuone_4);
		ImageView imageview01 = (ImageView)findViewById(R.id.image_wuone_1);
		switch(index)
		{
			case 1://ҽ�Ƽ�
				imageview01.setImageResource(R.drawable.ylj);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:55");
				textView03.setText("�ָ�Ŀ������������ʹ�ú�12���ڻָ�400��");
			break;
			case 2://����ҩˮ
				imageview01.setImageResource(R.drawable.jhys);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:45");
				textView03.setText("��15���ڻָ�Ӣ��100��ħ��ֵ");
			break;
			case 3://��������
				imageview01.setImageResource(R.drawable.zlsw);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:320");
				textView03.setText("�κø������ѷ����ӣ�������30�롣����ʹ�ã��Σ�������300����");
			break;
			case 4://��������
				imageview01.setImageResource(R.drawable.gssw);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:325");
				textView03.setText("����һ�����ӽ����Լ࿴�@������300�롣����ʹ��3��");
			break;
			case 5://��ũ����
				imageview01.setImageResource(R.drawable.snbc);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:2100");
				textView03.setText("�ǻ�+6�� (�֏�350��������ȴ30��)");
			break;
			case 6://������
				imageview01.setImageResource(R.drawable.qns);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:1100");
				textView03.setText("�ǻ� +4��(�֏͸�����܊100������ 2�b�ף���ȴ35��)");
			break;
			case 7://�ݼ�����
				imageview01.setImageResource(R.drawable.djts);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:1300");
				textView03.setText("�ǻ� 6��(������܊ 6�b�ף�����20�룬��ȴ60��)");
			break;
			case 8://���ӱ���
				imageview01.setImageResource(R.drawable.szbf);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:2100");
				textView03.setText("�ǻ� 10��(������܊�ƶ��ٶȱ��2��������10�룬����140��������ȴ60�룩");
			break;
			case 9://̫ƽҪ��
				imageview01.setImageResource(R.drawable.tpys);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:2000");
				textView03.setText("�ǻ� 6��(��Զ���빥����Ч������25�룬����100����,��ȴ60��)");
			break;
			case 10://�ϵ�����
				imageview01.setImageResource(R.drawable.mdxs);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:3000");
				textView03.setText("�ǻ� 10��(400�˺�����ȴ40��)");
			break;
			case 11://��ľ��֦
				imageview01.setImageResource(R.drawable.tmsz);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:50");
				textView03.setText("ȫ���� +1");
			break;
			case 12://��������
				imageview01.setImageResource(R.drawable.llst);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:150");
				textView03.setText("���� +3");
			break;
			case 13://��������
				imageview01.setImageResource(R.drawable.zldp);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:150");
				textView03.setText("�ǻ� +3");
			break;
			case 14://ƤЬ
				imageview01.setImageResource(R.drawable.px);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:150");
				textView03.setText("���� +3");
			break;
			case 15://�λ�
				imageview01.setImageResource(R.drawable.sh);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:170");
				textView03.setText("ȫ����+2");
			break;
			case 16://����
				imageview01.setImageResource(R.drawable.hw);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:150");
				textView03.setText("����+2");
			break;
			case 17://��������
				imageview01.setImageResource(R.drawable.jsst);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:650");
				textView03.setText("���� +15%");
			break;
			case 18://��������
				imageview01.setImageResource(R.drawable.yrmz);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:400");
				textView03.setText("ħ���ָ��ٶ�+50%");
			break;
			case 19://�ٶ�֮ѥ
				imageview01.setImageResource(R.drawable.sdzx);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:500");
				textView03.setText("�ƶ��ٶ� +50");
			break;
			case 20://�ָ�ָ��
				imageview01.setImageResource(R.drawable.hfzh);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:200");
				textView03.setText("�ظ�HP +2");
			break;
			case 21://��ʦ���� 
				imageview01.setImageResource(R.drawable.fscp);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:450");
				textView03.setText("�ǻ� +6");
			break;
			case 22://����ͷ��
				imageview01.setImageResource(R.drawable.nltk);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:950");
				textView03.setText("װ�� +5���؏�HP +2");
			break;
			case 23://�����
				imageview01.setImageResource(R.drawable.xwj);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:1550");
				textView03.setText("�b�� +10");
			break;
			case 24://��ȸ��
				imageview01.setImageResource(R.drawable.zqy);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:1700");
				textView03.setText("�������� +350");
			break;
			case 25://������
				imageview01.setImageResource(R.drawable.qld);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:1400");
				textView03.setText("�������� +300");
			break;
			case 26://��ʯ
				imageview01.setImageResource(R.drawable.zs);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:1100");
				textView03.setText("�������� +150���������� +100");
			break;
			case 27://�ٲ���
				imageview01.setImageResource(R.drawable.bcw);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:870");
				textView03.setText("ÿ��ظ�HP 4");
			break;
			case 28://� 
				imageview01.setImageResource(R.drawable.hd);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:950");
				textView03.setText("��������100%");
			break;
			case 29://ҹ����
				imageview01.setImageResource(R.drawable.ymz);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:2400");
				textView03.setText("ȫ���� +10");
			break;
			case 30://���α�ʯ 
				imageview01.setImageResource(R.drawable.xxbs);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:650");
				textView03.setText("�ܿ������ε�λ��#���ɷ�������������#");
			break;
			case 31://����
				imageview01.setImageResource(R.drawable.by);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:1600");
				textView03.setText("(���ص��ϳ� ���3��)\n LV1:ȫ���� +5�������r��15%���ʱ�������2��\n LV2:ȫ���� +10��ȫ���� 10�������r��25%���ʱ�������2�� \n LV3:ȫ���� +15��ÿ�ι���ʱ�ή�͵��˹����ٶȺ��ƶ��ٶȣ�����1.5��");
			break;
			case 32://����
				imageview01.setImageResource(R.drawable.ly);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:1400");
				textView03.setText("(���ص��ϳ� ���3��)\n LV1:ÿ�ι���-3����װ�ף���������\n LV2:���� 15��ÿ�ι���-5�����b�ף���������\n LV3:���� 30��ÿ�ι���-8�����b�ף���������");
			break;
			case 33://����
				imageview01.setImageResource(R.drawable.ly1);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:1500");
				textView03.setText("(���ص��ϳ� ���3��)\n LV1:����+ 15��ÿ�ι����r����10%�����ٻ�������70����3�ε���������\n LV2:���� 15������ 5��ÿ�ι����r����10%�����ن�������120����3�ε���������\n LV3:���� 25������ 10��ÿ�ι����r����10%�����ن�������200����3�ε���������");
			break;
			case 34://����
				imageview01.setImageResource(R.drawable.yy);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:1500");
				textView03.setText("(���ص��ϳ� ���3��)\n LV1:���� +20������ʱ��������ɢ��������������\n LV2:���� 40�������r��������ɢ��������������\n LV3:���� 60�������r��������ɢ��������������");
			break;
			case 35://����
				imageview01.setImageResource(R.drawable.dy);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:750");
				textView03.setText("(���ص��ϳ� ���3��)\n LV1:ÿһ�ι�������ʹĿ���ж���ÿ��9�����������ʱ��5��\n LV2:ÿһ�ι�������ʹĿ���ж���ÿ��18�����������ʱ��5��\n LV3:ÿһ�ι�������ʹĿ���ж���ÿ��27�����������ʱ��5��");
			break;
			case 36://�������
				imageview01.setImageResource(R.drawable.zzyc);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:1500");
				textView03.setText("���� +5");
			break;
			case 37://�����̽�
				imageview01.setImageResource(R.drawable.dzdj);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:1000");
				textView03.setText("���� +10");
			break;
			case 38://����֮��
				imageview01.setImageResource(R.drawable.llzf);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:1000");
				textView03.setText("���� +10");
			break;
			case 39://���֮��
				imageview01.setImageResource(R.drawable.fjzz);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:1050");
				textView03.setText("���� +10");
			break;
			case 40://ذ��
				imageview01.setImageResource(R.drawable.bs);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:650");
				textView03.setText("���� +9");
			break;
			case 41://����
				imageview01.setImageResource(R.drawable.tj);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:1150");
				textView03.setText("���� 15");
			break;
			case 42://���
				imageview01.setImageResource(R.drawable.tj1);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:1500");
				textView03.setText("���� 20");
			break;
			case 43://����֮�m
				imageview01.setImageResource(R.drawable.gtzc);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:1650");
				textView03.setText("���� 24");
			break;
			case 44://�¹�ǹ 
				imageview01.setImageResource(R.drawable.ygq);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:2300");
				textView03.setText("���� +28������ +15%");
			break;
			case 45://��ǹ
				imageview01.setImageResource(R.drawable.tq);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:1200");
				textView03.setText("���� +10������ +15%");
			break;
			case 46://��Ѫذ��
				imageview01.setImageResource(R.drawable.xxbs);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:1600");
				textView03.setText("���� +12��+5%��Ѫ");
			break;
			case 47://����ذ��
				imageview01.setImageResource(R.drawable.xtbs);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:1500");
				textView03.setText("���� +15���b�� +2");
			break;
			case 48://��
				imageview01.setImageResource(R.drawable.df);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:3200");
				textView03.setText("���� +24");
			break;
			case 49://���ҹ�
				imageview01.setImageResource(R.drawable.hzg);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:3600");
				textView03.setText("���� +24");
			break;
			case 50://ʷ��
				imageview01.setImageResource(R.drawable.sj);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:2800");
				textView03.setText("���� +24");
			break;
			case 51://��ǹ 
				imageview01.setImageResource(R.drawable.yq);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:2800");
				textView03.setText("���� +40");
			break;
			case 52://��罣
				imageview01.setImageResource(R.drawable.qhj);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:3000");
				textView03.setText("���� +35��ȫ����+5��");
			break;
			case 53://����
				imageview01.setImageResource(R.drawable.yj3);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:2600");
				textView03.setText("���� +36");
			break;
			case 54://��������
				imageview01.setImageResource(R.drawable.llhw);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:500");
				textView03.setText("���� +6���� +3");
				textView04.setText("��Ҫ������ȭ��(150)+������ָ(175)+��������������(175)");
			break;
			case 55://�����
				imageview01.setImageResource(R.drawable.hsf);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:495");
				textView03.setText("ȫ���� 3���ǻ� 6");
				textView04.setText("��Ҫ���λ�(170)+�ǻ۵�����(150) +��ֵǮ�Ļ����(175)");
			break;
			case 56://�ɵ�
				imageview01.setImageResource(R.drawable.xd);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:1820");
				textView03.setText("�؏�HP +4���������� +100%��ȫ���� +��");
				textView04.setText("��Ҫ���ٲ���(870) +�(950)");
			break;
			case 57://������
				imageview01.setImageResource(R.drawable.qlx);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:3100");
				textView03.setText("�������� +400����������+ 400����������+ 40%���؏�HP +1");
				textView04.setText("��Ҫ����ȸ��(1700) +������(1400)");
			break;
			case 58://���ٷ�
				imageview01.setImageResource(R.drawable.ssf);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:1350");
				textView03.setText("�ƶ��ٶ� 50������ 30%");
				textView04.setText("��Ҫ���ٶ�֮ѥ(500) +��������(650)+ ���ٷ�������(200)");
			break;
			case 59://��սʿ֮��
				imageview01.setImageResource(R.drawable.kzszf);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:2000");
				textView03.setText("���� 10��ʹ�ú��� 80%������ 20%���~�����30%����������12�룬��ȴʱ��30�룬���ķ���50");
				textView04.setText("��Ҫ������֮��(1000)+ ��սʿ֮��������(1000)");
			break;
			case 60://�����ĵ�
				imageview01.setImageResource(R.drawable.hwxd);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:880");
				textView03.setText("��Χʿ���b�� +3");
				textView04.setText("��Ҫ������֮��(380) +�����ĵ�������(500)");
			break;
			case 61://�ټ���
				imageview01.setImageResource(R.drawable.tjk);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:2400");
				textView03.setText("�b�� +5���p��Զ�����˺�+30%");
				textView04.setText("��Ҫ������ͷ��(950)+ �ټ�������(1450)");
			break;
			case 62://�籩֮��
				imageview01.setImageResource(R.drawable.fbzz);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:2450");
				textView03.setText("�ǻ� +20���������� 100%������ʹ�������飬ʹ��5��");
				textView04.setText("��Ҫ����ħ֮��(1050) +�(950)+ �籩֮��������(450)");
			break;
			case 63://��ħ��
				imageview01.setImageResource(R.drawable.tmd);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:2950");
				textView03.setText("ÿ�ι����ٵ�Ŀ��20���������� +10���ǻ� +6����ʹ�ÜQ��10�ο�ͨ���������������������");
				textView04.setText("��Ҫ���I�\�̄�(1000)+ ħ��֮��(450)+ ��ħ��������(1500)");
			break;
			case 64://���丫
				imageview01.setImageResource(R.drawable.xwf);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:3600");
				textView03.setText("���� +15������ +12��ʹ�ú�ħ�����ߣ�����17�룬��ȴʱ��90�룬���ķ���100");
				textView04.setText("��Ҫ������֮��(1000)+ ����(1150) +���丫������(1450)");
			break;
			case 65://����m 
				imageview01.setImageResource(R.drawable.egc);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:3150");
				textView03.setText("���� +30��������+13%��Զ����+5%����ѣ��1��");
				textView04.setText("��Ҫ������֮�(1650) +��������(150)+ ���������(1350)");
			break;
			case 66://��ʿ��
				imageview01.setImageResource(R.drawable.wsd);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:3300");
				textView03.setText("���� +35��13%�������Ŀ��2������");
				textView04.setText("��Ҫ������(1150) ذ��(650) ��ʿ��������(1400)");
			break;
			case 67://��ѥ
				imageview01.setImageResource(R.drawable.xx);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:2850");
				textView03.setText("�ƶ��ٶ� +50���ɴ��͵�����1000�ĵط�����ȴʱ��45��");
				textView04.setText("��Ҫ���ٶ�֮ѥ(500) +��ѥ������(2350)");
			break;
			case 68://������
				imageview01.setImageResource(R.drawable.fxr);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:3550");
				textView03.setText("���� +15������ +10��ʹ�ú����Σ�����12�룬��ȴʱ��30�룬���ķ���100");
				textView04.setText("��Ҫ���I�\�̄�(1000) +����(1150) +������������(1400)");
			break;
			case 69://������
				imageview01.setImageResource(R.drawable.wsz);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:5600");
				textView03.setText("�ǻ� +25���������� +200%������ʹ��а�������ķ���110����ȴʱ��35��");
				textView04.setText("��Ҫ���籩֮��(2450) +�(950) +��ʯ��1100)+ ����ħ��������(900)");
			break;
			case 70://������
				imageview01.setImageResource(R.drawable.hlj);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:2650");
				textView03.setText("���� +55��10%�������2.5���˺�");
				textView04.setText("��Ҫ������(1050) +��֮�� +�S����������(1600)");
			break;
			case 71://Դʽ֮��
				imageview01.setImageResource(R.drawable.yszk);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:3170");
				textView03.setText("�b�� +8��60%���ʜp��60�˺�");
				textView04.setText("��Ҫ�������(1550) +�ٲ���(870) +Դʽ֮��������(750)");
			break;
			case 72://���ǽ�
				imageview01.setImageResource(R.drawable.qxj);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:6650");
				textView03.setText("���� +60��ȫ���� +10��ÿ50��ֵ�һ�η���");
				textView04.setText("��Ҫ��ҹ����(2400) +����(2600) +���ǽ�������(1650)");
			break;
			case 73://���콣
				imageview01.setImageResource(R.drawable.ytj);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:5050");
				textView03.setText("���� +50��+15%��Ѫ");
				textView04.setText("��Ҫ����Ѫذ��(1600) +����(2600) +���콣������(850)");
			break;
			case 74://��ظ� 
				imageview01.setImageResource(R.drawable.ddf);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:6250");
				textView03.setText("���� +30���������� +350���؏�HP +10");
				textView04.setText("��Ҫ����ȸ��(1700) +��(3200) +��ظ�������(1350)");
			break;
			case 75://Ѫ��
				imageview01.setImageResource(R.drawable.xf);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:5450");
				textView03.setText("���� +75������ +15%��+25%����100�˺�");
				textView04.setText("��Ҫ���y��(2600) +��ǹ(1200) +Ѫ��������(1650)");
			break;
			case 76://��������
				imageview01.setImageResource(R.drawable.yxmr);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("�۸�:6300");
				textView03.setText("���� +25������ +30%��+25%�ر�");
				textView04.setText("��Ҫ���S�ҹ�(3600) +��ǹ(1200)+ �����ô�(1500)");
			break;
			case 77://��Ʒ�ϳɣ����ר����
				imageview01.setImageResource(R.drawable.wphc1);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText(null);
				textView03.setText(null);
				textView04.setText("�������µ�(����ר��)=��֮��+�¹�ǹ(2300) +��罣(3000)\n"+
												"���ܣ����� +60��ȫ���� +10��ϰ����������ն\n\n"+
												"�ɰ���ì(�ŷ�ר����)=���(1500) +����ذ��(1500) +�����ô�(1500)\n"+
												"���ܣ����� +60��+50%��ɢ�˺�\n\n"+
												"������(����ר��)=�yǹ(2600)+ ��֮��+ ����(1400)\n"+
												"���ܣ����� +57��ÿ�ι���-5�����b�ף�ϰ��ɱ����Ľ�\n\n"+
												"�����(�ӽyר��)=�籩֮��(2450) +�ٲ���(870) +ʷӛ(2800)\n"+
												"���ܣ��ظ�HP +10���������� +400���ǻ� +25��ʹ�ú��ٻ�һֻ��ˣ����ķ���250������80�룬��ȴʱ��180��");
			break;
			case 78://��Ʒ�ϳɣ�κ��ר����
				imageview01.setImageResource(R.drawable.wphc2);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText(null);
				textView03.setText(null);
				textView04.setText("����֮�齣(�ܲ�ר��)=���콣 +��֮Ѫ\n"+
												"���ܣ����� +40��+25%��Ѫ������ +30%\n\n"+
												"��վ����(�ĺ�Ԩר��)=���(1500) +����ذ��(1500) +�����ô�(1500)\n"+
												"���ܣ����� +60��+50%��ɢ�˺�\n\n"+
												"�S����砵�(����ר��)=����(2600)+ ����(1400) +�����ô�(1500) +��֮Ѫ\n"+
												"���ܣ����� +50������ +30%��ÿ�ι���-5�����b��\n\n"+
												"��������(����ר��)=������(3100)+ �籩֮��(2450) +������(1400)\n"+
												"���ܣ��������� +400���������� +400���ǻ� +25��ʹ�ú����м���������ȴʱ�䣬���ķ���300����ȴʱ��180��\n\n"+
												"��������(˾�Rܲר��)=������(3100) +ʷ��(2800)\n"+
												"���ܣ��������� +400���������� +400���ǻ� +25���b��ʱ����\"����\"����������200");
			break;
			
			
		}
	}
}

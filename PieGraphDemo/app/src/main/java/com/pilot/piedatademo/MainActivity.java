package com.pilot.piedatademo;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

	private PieGraph mPieGraph;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		initData();
	}

	private void initView() {
		mPieGraph = (PieGraph) findViewById(R.id.pie_graph);
	}

	private void initData() {
		List<PieGraph.PieDataHolder> pieceDataHolders = new ArrayList<>();
		pieceDataHolders.add(new PieGraph.PieDataHolder(10, 0xFFFFFF99, "江西"));
		pieceDataHolders.add(new PieGraph.PieDataHolder(10, 0xFF663300, "南昌"));
		pieceDataHolders.add(new PieGraph.PieDataHolder(10, 0xFF999933, "萍乡"));
		pieceDataHolders.add(new PieGraph.PieDataHolder(10, 0xFFCC3333, "赣州"));
		pieceDataHolders.add(new PieGraph.PieDataHolder(100, 0xFFFFFF00, "上饶"));
		pieceDataHolders.add(new PieGraph.PieDataHolder(100, 0xFF336699, "小曾"));
		pieceDataHolders.add(new PieGraph.PieDataHolder(170, 0xFF333399, "小吴"));
		pieceDataHolders.add(new PieGraph.PieDataHolder(200, 0xFFCC3366, "小谢"));
		pieceDataHolders.add(new PieGraph.PieDataHolder(200, 0xFFCC9999, "小明"));
		pieceDataHolders.add(new PieGraph.PieDataHolder(200, 0xFF336633, "小高"));
		pieceDataHolders.add(new PieGraph.PieDataHolder(200, 0xFFFFFF00, "今天"));
		pieceDataHolders.add(new PieGraph.PieDataHolder(200, 0xFFFF6666, "明天"));
		pieceDataHolders.add(new PieGraph.PieDataHolder(130, 0xFF993399, "后天"));
		mPieGraph.setPieData(pieceDataHolders);
	}
}

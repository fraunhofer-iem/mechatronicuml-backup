	within Root_cic.A1.RootStatechart;
package rootStatechart_operations
	function increaseInt
		input Integer myInt;
		output Integer ret;
	protected
	algorithm
		ret := myInt + 1;
		
		
	end increaseInt;
	function decreaseInt
		input Integer myInt;
		output Integer ret;
	protected
	algorithm
		ret := myInt - 1;
		
		
	end decreaseInt;
end rootStatechart_operations;;

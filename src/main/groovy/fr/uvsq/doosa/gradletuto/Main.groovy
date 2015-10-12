package fr.uvsq.doosa.gradletuto
import org.apache.commons.cli.Option
class Main {
    static void main(def args) {
       def cli= new CliBuilder()
	   cli.with{
usage: 'Self'
	h( longOpt: 'help', 'Usage informations and available options', required: false)
	d( argName: 'dir',  longOpt: 'working directory', args:1, required: true)
	a(longOpt: 'action', 'action  in command line', args:1)
	i(longOpt: 'input', 'input data', args:1, required:true)
	o(longOpt: 'output', 'output data', args:1, required:true)
}

def opt= cli.pars(args)
def action
	if(args.length== 0){
		cli.usage()
	return
}

    }

    String returnHello() {
        'Hello, Im Jihad'
    }

}

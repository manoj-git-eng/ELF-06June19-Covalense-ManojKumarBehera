const name='Manoj';

const element=<h1>{name}</h1>

function Welcome(props) {
    return (
        <div>
        <h1 style={{color:'blue'}}>{props.name}</h1>
        {/* <button onClick={()=>alert('Button')}>Click</button> */}
        <button onClick={alert.bind(this,'This is a button')}>Click</button>
        </div>
    )
}
class Message extends React.Component{
    constructor(props){
        super(props)
        this.state={
            name:'Manoj'
        }
        this.changeMessage=this.changeMessage.bind(this);
        this.clickLink=this.clickLink.bind(this);
        }
        render(){
            console.log("Rendering")
            return(
                <div>
                    <h1>{this.state.name}</h1>
                    <button onClick={this.changeMessage}>Change Message</button><br/>
                    <a href="https://www.google.com" onClick={this.clickLink}>Link</a>
                </div>
            )
        }
        clickLink(event){
            event.preventDefault();

        }
        changeMessage(){

            console.log("Change message method")
          /*   this.state.name='jjjj' */
            this.setState({
                name:'opera'
            }) 
        }
    }


/* ReactDOM.render(<Welcome name="Manoj"/>,document.getElementById("app")); */

ReactDOM.render(<Message/>,document.getElementById("app"));
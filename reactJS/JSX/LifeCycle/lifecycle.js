class Lifecycle extends React.Component{
    constructor(props){
        super(props)
        console.log('Constructor Lifecycle')
        this.state={
            name:'SID',
            checked: true
        }
    }
static getDerivedStateFromProps(){
    console.log('GetDerivedStateFromProps Lifecycle');
    return null;
}
render(){
    console.log('Render Lifecycle')
    if(this.state.checked){
    return(
        <div>
        <h1>{this.state.name}</h1>
        <button onClick={this.changeName.bind(this)}>Change Name</button>
        </div>
        
    )
    }return <h1>Checked is false</h1>
}
componentDidMount(){
    console.log('Component Did Mount Lifecycle')
}
shouldComponentUpdate(){
    console.log('should Component Update Lifecycle')
    return true;
}
getSnapShotBeforeUpdate(){
    console.log('snapshot Before update Lifecycle')
    return "SnapshotData";
}
componentDidUpdate(props,state,snapshot){
    console.log('Component Did Update Lifecycle')
    console.log('snapshot':snapshot)
    }
    changeName(){
        this.setState({
            name:'Dinga'
        })
    }
}
ReactDOM.render(<Lifecycle/>,document.getElementById("app"));
class Child extends React.Component{
    constructor(props){
        super(props)
        console.log('Constructor child Lifecycle')
        this.state={
            name:'Child Component',
            checked: true
        }
    }
static getDerivedStateFromProps(){
    console.log('GetDerivedStateFromProps Lifecycle');
    return null;
}
render(){
    console.log('Render Lifecycle')
    if(this.state.checked){
    return(
        <div>
        <h1>{this.state.name}</h1>
        <button onClick={this.changeName.bind(this)}>Change Name</button>
        </div>
        
    )
    }return <h1>Checked is false</h1>
}
componentDidMount(){
    console.log('Component Did Mount Lifecycle')
}
shouldComponentUpdate(){
    console.log('should Component Update Lifecycle')
    return true;
}
getSnapShotBeforeUpdate(){
    console.log('snapshot Before update Lifecycle')
    return "SnapshotData";
}
componentDidUpdate(props,state,snapshot){
    console.log('Component Did Update Lifecycle')
    console.log('snapshot':snapshot)
    }
    changeName(){
        this.setState({
            name:'Dinga'
        })
    }
}
ReactDOM.render(<div><Lifecycle/><Child/></div>,document.getElementById("app"));
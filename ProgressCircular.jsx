var MyPage = React.createClass({
    getInitialState: function() {
      return {progress: 0};
    },
  
    handleClick1: function() {
        <section style={{textAlign: 'center'}}>
            <p>
              <Ons.ProgressCircular value = {75} secondaryValue={100} />
            </p>
          </section>
    },
    
    handleClick2: function() {
        <section style={{textAlign: 'center'}}>
            <p>
              <Ons.ProgressCircular value = {100} secondaryValue={75}/>
            </p>
          </section>
    },
    
    render: function() {
      return (
        <Ons.Page renderToolbar={this.renderToolbar}>
          <Ons.ProgressBar value={this.state.progress} />
          <section style={{textAlign: 'center'}}>
            <p>
              <Ons.ProgressCircular value = {75} secondaryValue={100} />
            </p>
          </section>
          
          <section style={{textAlign: 'center'}}>
            <p>
              <Ons.Fab onClick={this.handleClick1}> - </Ons.Fab>
  
              <Ons.Fab onClick={this.handleClick2}> + </Ons.Fab>
            </p>
          </section>
          
        </Ons.Page>
      );
    }
  });
  
  ons.ready(function() {
    ReactDOM.render(<MyPage />, document.getElementById('app'));
  });
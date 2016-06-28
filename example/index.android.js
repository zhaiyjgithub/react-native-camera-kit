import React, { Component } from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View,
  TouchableOpacity,
  Image
} from 'react-native';

import CameraScreen from  './CameraScreen';

class example extends Component {

  constructor(props) {
    super(props);
    this.state = {
      example: undefined
    };
  }

  render() {
    return (
      <View style={styles.container}>
        <TouchableOpacity onPress={() => this.setState({example: CameraScreen})}>
          <Text style={styles.buttonText}>
            Camera Screen
          </Text>
        </TouchableOpacity>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  buttonText: {
    color: 'blue',
    marginBottom: 20,
    fontSize: 20

  }
});

AppRegistry.registerComponent('example', () => example);

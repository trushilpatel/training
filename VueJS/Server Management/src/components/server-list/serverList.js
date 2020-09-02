import serverItem from '../server-item/serverItem'

export default {
  name: 'serverList',
  props: ['serverNames'],
  components: {
    serverItem
  },
  methods: {
    clicked (event) {
      // this.$emit('clicked', {serverName: this.serverName})
      console.log(event, ' is clicked')
    }
  }

}

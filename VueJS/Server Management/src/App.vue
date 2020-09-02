
<template>
  <div v-if='true'>
    <p v-myon:onBind.hello="helloworld">Hello this is my custom directive</p>
    <serverList :serverNames="serverNames" />
  <serverItem :serverName="'Hello world'"/>
  </div>
  <div v-else>This is the second div</div>
</template>

<script>
import serverList from './components/server-list/serverList.vue'
import serverItem from './components/server-item/serverItem.vue'

export default {
  name: 'app',
  components: {
    serverList,
    serverItem
  },
  beforeCreate () {
    console.log('beforeCreate')
  },
  created () {
    console.log('created')
  },
  beforeMount () {
    console.log('beforeMount')
  },
  beforeUpdate () {
    console.log('beforeUpdate')
  },
  beforeDestroy () {
    console.log('beforeDestroy')
  },
  directives: {
    myon: {
      data: {
        serverNames: ['nothing to show']
      },
      bind (el, binding, vnode) {
        console.log(binding.arg, binding.value)
        console.log(binding)
        binding.value.call()
        console.log('Modifienrs :')
        console.log(binding.modifiers)
      }
    }
  },
  data: function () {
    return {
      serverNames: [1, 2, 3, 4, 5]
    }
  },
  methods: {
    helloworld () {
      console.log('Hello world')
    }
  }

}
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>

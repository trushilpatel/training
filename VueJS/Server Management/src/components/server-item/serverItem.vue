<template>
  <div @click="clicked(serverName)">{{serverName}}</div>
</template>

<script>
export default {
  props: {
    serverName: [Number, String]
  },
  data: function () { return {} },
  methods: {
    clicked () {
      this.$emit('clicked', {serverName: this.serverName})
      console.log(this.serverName, ' is clicked')
    }
  },
  template: '<h1>Hhgfghgfghgh hjg jhg</h1>'}
</script>

<style scoped>
</style>
